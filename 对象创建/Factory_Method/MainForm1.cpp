#include <string>
#include "FileSpliter1.cpp"

class Form{};
class ProgressBar{public: void setValue(int num){}};
class TextBox{public: std::string getText(){ return "/file/path"; } };

class MainForm : public Form{
    TextBox* txtFilePath;
    TextBox* txtFileNumber;

    ProgressBar* progressBar; 

public:
    void Button1_Click(){

        ISplitter* splitter = new BinarySplitter();  //依赖具体类

        splitter->split();

        delete splitter;
    }
};