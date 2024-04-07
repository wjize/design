#include <iostream>
#include <string>
#include "FileSplitter2.cpp"

class Form{};
class TextBox{public: std::string getText(){ return "/file/path"; } };

class MainForm : public Form , public IProgress{
    TextBox* txtFilePath;
    TextBox* txtFileNumber;

    ProgressBar* progressBar;  //新增

public:
    void Button1_Click(){

        std::string filePath = txtFilePath->getText();
        int number = atoi(txtFileNumber->getText().c_str());

        ConsoleNotifier cn;

        //FileSplitter splitter(filePath, number, &cn);
        FileSplitter splitter(filePath, number, this);

        splitter.split();
    }

    virtual void DoProgress(float value){
        progressBar->setValue(value);
    }
};

class ConsoleNotifier : public IProgress{
    virtual void DoProgress(float value){
        std::cout << "." ;
    }
};