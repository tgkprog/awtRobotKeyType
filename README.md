# Java Awt Robot Key Type

## Usage 1:

```
java org.s2n.ddt.util.SendKeys "<String>" 
```        

  Param 1 is the string that is iterated to send keys for enter key `\\n`

## Usage 2 :

```
java org.s2n.ddt.util.EnterKeys <count>
```
    
 Number of enter keys (count) to send with initial sleep 2 seconds and then 110 milli seconds between each key

### Usage 2(a) :
    
```
java org.s2n.ddt.util.EnterKeys <count>
```
# About
Desktop utility. Uses Java awt Robot class. Does not create its own window. Invoke command and it sends keys to active window (could be terminal or notepad or any other active window).

# Author 
Tushar Kapila   [sel2in](https://sel2in.com/ "sel2in website") || [stack overflow](https://stackoverflow.com/users/1643558/tgkprog "stack overflow tgkprog") || [on twitter](https://twitter.com/tushar_Kapila/ "On twitter")
