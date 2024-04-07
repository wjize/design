//业务操作
class Stream{
public:
    virtual char Read(int number) = 0;
    virtual void Seek(int position) = 0;
    virtual void Write(char data) = 0;

    virtual ~Stream(){}
};

//主体类
class FileSteam : public Stream{
public:
    virtual char Read(int number){
        //读文件流
        return 'Hello';
    }
    virtual void Seek(int position){
        //定位文件流
    }
    virtual void Write(char data){
        //写文件流
    }
};

class NeetworkSteam : public Stream{
public:
    virtual char Read(int number){
        //读网络流
        return 'Hello';
    }
    virtual void Seek(int position){
        //定位网络流
    }
    virtual void Write(char data){
        //写网络流
    }
};

class MemorySteam : public Stream{
public:
    virtual char Read(int number){
        //读内存流
        return 'Hello';
    }
    virtual void Seek(int position){
        //定位内存流
    }
    virtual void Write(char data){
        //写内存流
    }
};

//扩展操作
class CryptoFileStream : public FileSteam{
public:
    virtual char Read(int number){
        //额外的加密操作
        FileSteam::Read(number);
    }
    virtual void Seek(int number){
        //额外的加密操作
        FileSteam::Seek(number);
    }
    virtual void Write(int number){
        //额外的加密操作
        FileSteam::Write(number);
    }
};

class CryptoFileStream : public NeetworkSteam{
public:
    virtual char Read(int number){
        //额外的加密操作
        NeetworkSteam::Read(number);
    }
    virtual void Seek(int number){
        //额外的加密操作
        NeetworkSteam::Seek(number);
    }
    virtual void Write(int number){
        //额外的加密操作
        NeetworkSteam::Write(number);
    }
};

class CryptoFileStream : public MemorySteam{
public:
    virtual char Read(int number){
        //额外的加密操作
        MemorySteam::Read(number);
    }
    virtual void Seek(int number){
        //额外的加密操作
        MemorySteam::Seek(number);
    }
    virtual void Write(int number){
        //额外的加密操作
        MemorySteam::Write(number);
    }
};

class BufferedFileStream : public FileSteam{
    //...
};
class BufferedNetworkStream : public NeetworkSteam{
    //...
};
class BufferedMemoryStream : public MemorySteam{
    //...
};

void Process(){

    //编译时装配
    CryptoFileStream* fs1 = new CryptoFileStream();
    BufferedFileStream* fs2 = new BufferedFileStream();
    //...

    delete fs1;
    delete fs2;
}