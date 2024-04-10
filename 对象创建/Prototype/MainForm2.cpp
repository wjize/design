#include <string>
//#include "FileSpliter1.cpp"
#include "SplitterFactory.cpp"

class Form{};

class MainForm : public Form{
private:
    ISplitter* prototype; //原型对象

public:
    MainForm(ISplitter* prototype){
        this->prototype = prototype;
    }

    void Button1_Click(){

         
        ISplitter* splitter = prototype->clone();  //克隆原型

        splitter->split();

        delete splitter;
    }
};