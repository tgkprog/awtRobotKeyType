cd <ur loc</RobotTyper/
javac -d ./bin -cp ./src src/org/s2n/ddt/util/*.java


##cd bin
nohup java -cp bin org.s2n.ddt.util.EnterKeys 100 1 &

java -cp bin org.s2n.ddt.util.EnterKeys 5000 130 230
java -cp bin org.s2n.ddt.util.SendKeys " a msg \\nok"


cp -R * ../pack
cd ../pack
jar cvfM ../RobotTyper.jar *
jar cvf ../RobotTyper.jar *
cd ..
gedit &
sleep 1
java -jar RobotTyper.jar "test\nit"
#
