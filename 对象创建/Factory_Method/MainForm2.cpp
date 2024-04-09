#include <string>
//#include "FileSpliter1.cpp"
#include "SplitterFactory.cpp"

class Form{};

class MainForm : public Form{
private:
    SplitterFactory* factory; 

public:
    MainForm(SplitterFactory* factory){
        this->factory = factory;
    }

    void Button1_Click(){

         
        ISplitter* splitter = factory->CreateSplitter();  //多态new

        splitter->split();

        delete splitter;
    }
};