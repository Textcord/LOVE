@echo off
set /p name=이름: 
:loop
echo %name% 사랑해줘❤
powershell -nop -c "& {sleep -m 500}"
echo %name% 사랑해줄래요?
powershell -nop -c "& {sleep -m 500}"
goto loop
