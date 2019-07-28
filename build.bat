@echo off
cls

set DRIVE_LETTER=%1:
set INPUT_FILE=%2
set PATH=%DRIVE_LETTER%\Java\bin;%DRIVE_LETTER%\Java\ant-1.9.6\bin;c:\Windows

ant run-command-line -Ddrive-letter=%DRIVE_LETTER% <%INPUT_FILE%
::ant run-gui -Ddrive-letter=%DRIVE_LETTER%