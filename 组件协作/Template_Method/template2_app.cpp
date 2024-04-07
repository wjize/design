#include "template2_lib.cpp"

class Application : public Library
{
protected:
    virtual bool Step2(){
        //...
    }
    virtual void Step4(){
        //...
    }
};

int main(int argc, char const *argv[])
{
    Library* pLib = new Application();
    pLib->Run();
    
    delete pLib;
    
    return 0;
}
