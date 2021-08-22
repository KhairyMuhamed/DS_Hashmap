Class Node{
Node next;
Int data;
// constructor to initialize variables
Node(int x){
Data = x;
// pointer
Next = null;
}
/* getCount method to calculate # of nodes in linkedlist which every cell in HashTable is 
consist of it
*/
Int getCount(){
If (next Node ==null)
Return zero
Else
// Count # of Nodes in LinkedList
Tmp = next;
Counter = 0;
While(temp has value)
Counter ++ ;
Return Counter; }
}
Pseudo Code
// main class of hashTable
Class HashTable{
 // array list to put number of nodes in every cell of hashTable in it
Create ArrayList <> counters;
Create Node[]hashTable;
Create variable to calculate # of spaces
Int Spaces =0;
HashTable() {
// hashtable array of linkedList with the size of ASCI table
 hashtable = new Node[127];
 }
Main Function(String[]args){
//create object
 HashTable HT = new HashTable();
 // take the String from user
Print(“enter the string”)
String s = input from user;
 // create array of charecters (with size 1000 which is the most available # of char which 
user can input) to put every char of String in it
 char[] keys = new char[1000];
// put every character of string in the array using charAt
For (I = 0  127)
Keys[I]=String.charAt(I);
If (Space detected)
Space ++;
/* count # of Nodes in every linkedList in my HashTable and put it in counters ArrayList 
and if null NullPointerException
 occurs when you found an empty cell then handle it by put 0 in it's index in arrayList
 */
For(int I=0127)
// put it into try catch to handle null pointer exception
Try{getCount of hashTable[i]
Add (result of counts we calculate hashTable[i] to ArrayList<>counters)
}Catch( NullPointerException){
Add zero to this Index in ArrayList<>counters;
//Call method
HT.getMax(); 
}
// add char to the hashTable
Void Add(character){
//get my Index Position
Int first = current index in my hash
//create new Node
Node MyNode = new Node(character);
 // add newNode forn front to make train of Nodes
 // if first node is null then put th new node in it
If (first Node in hashTable ==null)
First =MyNode;
Else
nextNode = first Node;
FirstNode=MyNode;
}
// hash every character to its' ASCI code in the hashTable
Int myHash(character){
Int hashVal = character.hashCode();
// value (modules) hashTable Size
hashVal = hashVal%127;
if (hashVal<0)
hashVal = hashVal + hashTable Size
return hashVal;
}
// getMax method to find the longest linkedList in the hashTable
Int getMax(){
/*intialize max with -infinity and replace it with the new max which will get from 
 */counters ArrayList
int Max = - infinity;
 int Ind = 0;
for(i=0127){
if(Max <counters[i]){
Max = counters[i];
Ind = i;}}
// convert the Max Integer to its' ASCI char again and print it and its' number 
 //of occurance
 char c = (char) Ind;
// if the spaces was greater than or equal the # of max occurance char then print 
 // that the spaces is the most occurance char
 if (Spaces >= Max)
print(“Spaces”);
 // else then print the char which is the most occurance and its' number of occurrence
Else
Print (Character + “:” +Max )
Return Ind;
 }
 }
