#!/bin/sh
#Implement shell script to move files of given timestamp from one directory to another directory by taking source directory name, destination directory name, timestamp.
# sh move_files_to_dir summer spring 2022-08-01
cd /c/users/z032478/Holidaytask
ls -lrt
echo "The file name is :"$0
echo "The destination directory :"$2
echo "The Timestamp is :"$3
FILES=$(ls $1)
echo "Files in source :" $FILES
TO_MOVE=""
for F in $FILES
do
T=$(date -r "$1/$F")
if [ "$T" = "$3" ];
then
mv $TO_MOVE $2
fi
done





