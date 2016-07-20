cd /u/w/sts2s380RC2/RobotTyper/
cd bin
cp -R * ../pack
cd ../pack
jar cvfM ../RobotTyper.jar *
jar cvf ../RobotTyper.jar *
cd ..
gedit &
sleep 1
java -jar RobotTyper.jar "test\nit"
#
