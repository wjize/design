#include <string>
using namespace std;

class ProgressBar{public: void setValue(int num){}};

class IProgress{
public:
    virtual void DoProgress(float value) = 0;
    virtual ~IProgress(){}
};

class FileSplitter{
    string m_filePath;
    int m_fileNumber;

    //ProgressBar* m_progressBar;  //具体通知控件
    IProgress* m_iprocess;  //抽象通知机制

public:
    FileSplitter(const string& filePath, int fileNumber, IProgress* iprogress) : 
        m_filePath(filePath),
        m_fileNumber(fileNumber),
        m_iprocess(iprogress)
    {

    }

    void split(){
        //1.读取文件

        //2.分批次向小文件写入
        for (int i = 0; i < m_fileNumber; i++){
            //...
            onProgress((i + 1)/(float)m_fileNumber);
        }
    }

protected:
    void onProgress(float value){
        if (m_iprocess != nullptr){
            m_iprocess->DoProgress(value); //更新进度条
        }
    }
};