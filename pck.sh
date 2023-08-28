#!/bin/bash
# cd <ur loc RobotTyper>

# mkdir bin

cd bin
if( $ERROR ) then
    echo "Error: $ERROR"
    exit 1
fi
rm -Rf *
cd ..

javac -d ./bin -cp ./src src/org/s2n/ddt/util/*.java


cd bin
#nohup java -cp bin org.s2n.ddt.util.EnterKeys 100 1  >null 2>null  &

# java -cp bin org.s2n.ddt.util.EnterKeys 5000 130 230
# java -cp bin org.s2n.ddt.util.SendKeys " a msg \\nok"


cp * ../pack
cd ../pack
jar cvfM ../RobotTyper.jar *
jar cvf ../RobotTyper.jar *
cd ..
nohup gedit >null 2>null &
sleep 1
java -jar RobotTyper.jar "test\nit"
#
