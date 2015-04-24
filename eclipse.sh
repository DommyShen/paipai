#!/bin/ksh
echo ===============================================================================
echo .
echo      Eclipse sell
echo .
echo ===============================================================================

mvn eclipse:clean eclipse:eclipse  -DdownloadSources=true -Dmaven.test.skip=true -U
cd -