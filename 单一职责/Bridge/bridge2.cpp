//由于某些类型的固有的实现逻辑，使得它们具有两个变化的维度，乃至多个维度的变化。

//将抽象部分(业务功能)与实现部分(平台实现)分离，使它们都可以独立地变化

#include <string>
using namespace std;

class Image {};

class Messager{
protected:
    MessagerImp* m_messagerImp;  //new PCMessagerBase, new MobileMessagerBase
public:
    Messager(MessagerImp* messagerImp) : m_messagerImp(messagerImp){}
    virtual void Login(string username, string password) = 0;
    virtual void SendMessage(string message) = 0;
    virtual void SendPicture(Image image) = 0;

    virtual ~Messager(){};
};

class MessagerImp{
public:
    virtual void PlaySound() = 0;
    virtual void DrawShape() = 0;
    virtual void WriteText() = 0;
    virtual void Connect() = 0;

    virtual ~MessagerImp(){};
};

//平台实现
class PCMessagerImp : public MessagerImp{
public:
    virtual void PlaySound(){
        //*****
    }
    virtual void DrawShape(){
        //*****
    }
    virtual void WriteText(){
        //*****
    }
    virtual void Connect(){
        //*****
    }
};

class MobileMessagerImp : public MessagerImp{
public:
    virtual void PlaySound(){
        //*****
    }
    virtual void DrawShape(){
        //*****
    }
    virtual void WriteText(){
        //*****
    }
    virtual void Connect(){
        //*****
    }
};

//业务抽象
class MessagerLite : public Messager{
public:
    MessagerLite(MessagerImp* messagerImp) : Messager(messagerImp) {}

    virtual void Login(string username, string password){
        m_messagerImp->Connect();
        //.....
    }
    virtual void SendMessage(string message){
        m_messagerImp->WriteText();
        //.....
    }
    virtual void SendPicture(Image image){
        m_messagerImp->DrawShape();
        //.....
    }
};

class MessagerPerfect : Messager{
public:
    MessagerPerfect(MessagerImp* messagerImp) : Messager(messagerImp) {}

    virtual void Login(string username, string password){
        m_messagerImp->PlaySound();
        //.....
        m_messagerImp->Connect();
        //.....
    }
    virtual void SendMessage(string message){

        m_messagerImp->PlaySound();
        //.....
        m_messagerImp->WriteText();
        //.....
    }
    virtual void SendPicture(Image image){

        m_messagerImp->PlaySound();
        //.....
        m_messagerImp->DrawShape();
        //.....
    }
};


void Process(){
    //编译时装配
    MessagerImp* mImp = new PCMessagerImp();
    Messager* m = new MessagerLite(mImp);

    delete mImp;
    delete m;
}