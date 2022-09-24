ssh -i "Ubuntu-Machine1.pem" ubuntu@ec2-888888888888.ap-south-1.compute.amazonaws.com

Create a file in Linux: 
cat>file1

Touch file - will also create a file. But it will not ask to enter the information. it just created empty file.

Come out of file : 
Ctrl+D

Read the content of the file : (No greater than symbol)
cat file1

List all the file : 
LS

If we need additional information of the file : use the long list:
ls -l               (give the meta data)

Hidden file/Directory: file name starts with . (EX: .file5, .d2) 
ls -a : it give normal list of all the files and hidden files.
ls -la : it gives detaisl of all the files including hidden files.
ls -lt : list all the files by - time stamp : latest to old order


copy file: 
syntax: cp source destination 
cp file1 file7 : if destination file is present it will copy the data. if suppose the destination file is not present- it will create the destination fiel and paste the content

remove file : 
syntax: rm filename 
example: rm file3

create a directory: 
mkdir d1

remove directory:
rmdir d1 - deletes the directory if its empty.
rm -r d1 - irrespective of the directory is empty or not. it will delete the directory. 

pwd: print working directory
It shows the current path(Location)

enter into directory: CD
CD: change directory 
cd d1 - directory changed to d1

move to the parent directory: 
cd ..

working with root user: # : root user prompt will be indicated with # 
working as normal users indicated with : $ : prompt

su : switch user
"su root" & "su ubuntu": this command help in switch from one user to other user.
if we have password for the root then only we can switch to the root use.

SUDO: "super user do"

sudo su root: will switch to the root user - with out asking any password. if the user is having permissions o use the sudo keyword
because the sudo keyword is very power. 

chmod: change mode the permission of the file
Examples: chmod 764 file7 
		  chmod 777 file7

alphabetical - chmod: 
owner -- u
group -- g
user -- o
examples: 
		chmod u+x file1
		chmod u-x file1
		chmod g-w,g+x,o+x file7	


word count : give the word count of the file
syntax: wc file1
 3 7 40 file1
 3: no of lines
 7: no of words
 40: no of characters
 
 wc -l file : given result of, no of lines
 wc -w file : given result of, no of words
 wc -c file : given result of, no of characters
 
Head command: 
Example: head -5 file7
 gives the first 5 line of the filename provided

Tail command:
Example: Tail -3 file1
 gives the last 3 lines of the file
 
how to get specific line of file: or run the specific command of file: 
head -5 file7 | tail -1 : this gives the specific line of the file
 
date | wc -l : this command gives the no of lines in the date 
cat | wc -l : this command gives the no of lines in the calender

APT Repository: 
1. First we have to update the repository 
2. Install the package 

To install packages: sudo apt-get update

syntax for step1: update apt repository
sudo apt-get update 

syntax for step2: install the required packages
sudo apt-get install tree 

then - we can get/see the heirarchy of the directory - d1
Example: tree d1

Vi Editor: 
Basic editor in linux

Syntax: VI filename
example : vi file10

two modes in vi editor 
command mode (Default mode)
Insert mode 

i - to go to insert mode
ESC Key  - to come out of insert mode to command mode

:wq - save and exit
:q! - Exit with out saving

dd- to delete a line - command mode
yy - to copy the line
p - to paste the line

















