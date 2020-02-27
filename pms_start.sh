#!/bin/bash
JARNAME=pms-backend.jar
## 查找进程id kill 掉
tpid=`ps -ef|grep $JARNAME|grep -v grep|grep -v kill|awk '{print $2}'`


if [ ${tpid} ]; then
echo 'Stop deploy pms jar ...'
kill -15 $tpid
fi
sleep 5
tpid=`ps -ef|grep $JARNAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${tpid} ]; then
echo 'Kill pms process!'
kill -9 $tpid
else
echo 'Stop pms jar!'
fi
 
tpid=`ps -ef|grep $JARNAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${tpid} ]; then
    echo '$JARNAME is running.'
else
    echo '$JARNAME is NOT running.'
fi
 
rm -f tpid
nohup java -jar ./$JARNAME --spring.profiles.active=prod > /dev/null  2>log &
echo $! > tpid
echo Start pms Success!