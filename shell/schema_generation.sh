#!/bin/sh
#Create a shell script to generate schema file for given avro file and move generated schema to give destination directory by taking avro file path as parameter and schema file directory.
#sh schema_generation tmp_pms_ref_user_20220127030107_REF_USER_2022012040106
cd /c/aaa
ls 
 java -jar avro-tools-1.7.5.jar getschema $1.avro > bha.csv #sha.avsc
 echo "enter destination"
 read destination
 #mv sha.avsc $destination
 mv  bha.csv  $destination

