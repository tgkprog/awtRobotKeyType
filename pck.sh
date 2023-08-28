#!/bin/bash
# cd <ur loc RobotTyper>

# mkdir bin
set +e
cd bin
if [ $? -ne 0 ]; then
    echo "Error 'bin' directory $? $ERROR $ERROR_MSG"
    exit 1
fi
rm -Rf *
cd ..

javac -d ./bin -cp ./src src/org/s2n/ddt/util/*.java


cd bin
#nohup java -cp bin org.s2n.ddt.util.EnterKeys 100 1  >null 2>null  &

# java -cp bin org.s2n.ddt.util.EnterKeys 5000 130 230
# java -cp bin org.s2n.ddt.util.SendKeys " a msg \\nok"
echo "in bin " `pwd`
cd ../pack
if [ $? -ne 0 ]; then
    echo "Error 'pack' directory $ERROR $ERROR_MSG"
    exit 1
fi
pwd
echo "rm "
rm -Rf *
echo cp

cd ../bin/ 
cp -R * ../pack/
cd ../pack/
cp -R ../META-INF .

ls

sleep 2
jar cf ../RobotTyper1.jar *
echo "jar 2"
jar cvfM ../RobotTyper.jar *
cd ..
nohup gedit >null 2>null &
sleep 1
#java -cp RobotTyper1.jar org.s2n.ddt.util.SendKeys  "test\\nit"

java -jar RobotTyper.jar  "test\\nit"
#
