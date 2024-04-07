#include <string>
using namespace std;

class ProgressBar{public: void setValue(int num){}};
class FileSplitter{
    string m_filePath;
    int m_fileNumber;
    ProgressBar* m_progressBar;

public:
    FileSplitter(const string& filePath, int fileNumber, ProgressBar* progressBar) : 
        m_filePath(filePath),
        m_fileNumber(fileNumber),
        m_progressBar(progressBar)
    { 

    }

    void split(){
        //1.读取文件

        //2.分批次向小文件写入
        for (int i = 0; i < m_fileNumber; i++){
            //...
            if (m_progressBar != nullptr){
                m_progressBar->setValue((i + 1)/m_fileNumber);
            }
        }
    }
};