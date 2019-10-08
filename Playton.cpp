#include <iostream>
#include <iostream>
#include <string>
#include <cstdlib>
#include <cmath>

using namespace std;

bool die(const string & msg);

int main()
{
	int number_1 , number_2;
	char op;		

	cout << "gimme an expression:  ";	
	cin >> number_1 >> op >> number_2;	

	int add = number_1 + number_2;	
	int sub = number_1 - number_2;	
	int divide = number_1 / number_2;	
	int mod = number_1 % number_2;	
	int mult = number_1 * number_2;	

	if(!cin)
	{
		die("Input Error");	
	}

	else if(number_1 == 0 || number_2 == 0)
	{
		cout << "can not use zero \n";
	}

	else if(op == '+' )
	{
		cout << number_1 << " " << op << " " << number_2 << " == " << add << "\n";
	}	

	else if(op == '-')
	{
		cout << number_1  << " " << op << " " << number_2 << " == " << sub << "\n";
	}

	else if(op == '*')
	{
		cout << number_1 << " " << op << " " << number_2 << " == " << mult << "\n";
	}

	else if(op == '/')
	{
		cout << number_1 << " " << op << " " << number_2 << " == " << divide << "\n";
	}

	else if(op == '%')
	{
		cout << number_1 << " " << op << " " << number_2 << " == " << mod << "\n";	
	}

}
bool die(const string & msg) 
{
	cout << "Fatal error:" << msg << "\n";
	exit(EXIT_FAILURE);
}
