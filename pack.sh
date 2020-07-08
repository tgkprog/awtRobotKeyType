cd <ur loc</RobotTyper/
javac -d ./bin -cp ./src src/org/s2n/ddt/util/*.java


cd bin

java -cp . org.s2n.ddt.util.EnterKeys 130 230
java -cp . org.s2n.ddt.util.SendKeys " a msg \\nok"


cp -R * ../pack
cd ../pack
jar cvfM ../RobotTyper.jar *
jar cvf ../RobotTyper.jar *
cd ..
gedit &
sleep 1
java -jar RobotTyper.jar "test\nit"
#
