# CSE-6324-Team3
Program Analysis Tool for Ethereum based Smart Contracts.
Specification and design:
List of inputs -
● Grammar file for solidity.
● Solidity smart contract.
List of outputs -
● Parse tree.
● Detected vulnerabilities in the smart contract provided.

Tools and technologies:
● Eclipse IDE
● Antlr4 plugin jar (Version - 4.7.2)
● Java 8
Environment setup for Antlr:
Linux -
● $ cd /usr/local/lib
● $ wget https://www.antlr.org/download/antlr-4.7.2-complete.jar
● $ export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
● $ alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'
● $ alias grun='java org.antlr.v4.gui.TestRig’
Windows -
● Download https://www.antlr.org/download/antlr-4.11.1-complete.jar.
● Add antlr4-complete.jar to CLASSPATH, either: Permanently: Using System
Properties dialog > Environment variables > Create or append to CLASSPATH
variables.
● Temporarily, at command line: SET
CLASSPATH=.;C:\Javalib\antlr4-complete.jar;%CLASSPATH%
● Create batch commands for ANTLR Tool, TestRig in dir in PATH
antlr4.bat: java org.antlr.v4.Tool %*
grun.bat: java org.antlr.v4.gui.TestRig %*
To set antlr4 in macOS - visit https://www.antlr.org/
Code and Tests:
Steps for generating parse trees -
● Goto the grammar folder and open terminal/cmd and type - antlr4 -visitor
Expr.g4
● Compile classes - javac *.java
● cd ..
● In the src folder - grun grammar.Expr pragmaDirective tests/test.sol -gui &

Steps to run our application:
● Set up run configuration on the project: run > run configurations
● In run configuration > arguments > variables Selectfile_prompt
● Click ok >run. Provide the required test file as input as shown below

Output: Consists of warnings of 4 kinds of vulnerabilities for the input .sol smart contract. Namely:
1) Compiler Version not fixed.
2) Style Guide Violation.
3) Private Modifiers.
4) Implicit Visibility Level.
