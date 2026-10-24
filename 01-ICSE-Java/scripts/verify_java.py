from pathlib import Path
import subprocess, tempfile, sys
root=Path(__file__).resolve().parents[1]
files=sorted(root.glob('Class-*/**/examples/*.java'))
errors=[]
with tempfile.TemporaryDirectory() as output:
    for file in files:
        result=subprocess.run(['javac','-d',output,str(file)],capture_output=True,text=True)
        if result.returncode: errors.append((str(file),result.stderr))
print(f'Checked {len(files)} Java files; failures: {len(errors)}')
for file,err in errors: print(file,err)
sys.exit(bool(errors))
