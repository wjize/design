#include <string>
#include "FileSplitter1.cpp"

class Form{};
class ProgressBar{public: void setValue(int num){}};
class TextBox{public: std::string getText(){ return "/file/path"; } };

class MainForm : public Form{
    TextBox* txtFilePath;
    TextBox* txtFileNumber;

    ProgressBar* progressBar;  //新增

public:
    void Button1_Click(){

        std::string filePath = txtFilePath->getText();
        int number = atoi(txtFileNumber->getText().c_str());

        FileSplitter splitter(filePath, number, progressBar);

        splitter.split();
    }
};