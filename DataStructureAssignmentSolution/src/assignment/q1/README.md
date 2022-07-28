# Problem Statement
Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. The construction is in such a way that the floors will be constructed in other factories and they will be assembled. All the sizes will be distinct. <br /><br />
The skyscraper needs to be constructed in N days with the following conditions : <br />
a) Every day a floor is constructed in a separate factory of distinct size.<br />
b) The floor with the larger size must be placed at the bottom of the building.<br />
c) The floor with the smaller size must be placed at the top of the building.<br /><br />
Note: A floor cannot be assembled in the building until all floors larger in size are placed.<br />
As a friend he wants you to build a small program that will help him analyze the construction process, to avoid manual work and errors.<br /> <br/>


## TestCase: 
enter the total no of floors in the building<br/>
3<br/>
enter the floor size given on day : 1<br/>
3<br/>
enter the floor size given on day : 2<br/>
1<br/>
enter the floor size given on day : 3<br/>
2<br/><br/>
The order of construction is as follows - <br/>
Day: 1<br/>
3<br/>
Day: 2<br/>
Day: 3<br/>
2 1<br/><br/>
### Explanation
The largest floor size is available on day 1 itself, hence it will be assembled on day 1.
On the second day floor of size 1 is available and cannot be assembled as the floor of size 2 is
not available.<br/>
On the third day floor of size 2, is available and accordingly, the remaining floor (2,1) will
assemble in the order 2,1<br/>
------------------------------------------