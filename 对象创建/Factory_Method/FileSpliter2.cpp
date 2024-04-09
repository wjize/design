#include <string>
#include "SplitterFactory.cpp"
using namespace std;

//具体类
class BinarySplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class TxtSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class PictureSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class VideoSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
};

//具体工厂
class BinarySplitterFactory : public SplitterFactory{
public:
    virtual ISplitter* CreateSplitter(){
        return new BinarySplitter();
    }
};

class TxtSplitterFactory : public SplitterFactory{
public:
    virtual ISplitter* CreateSplitter(){
        return new TxtSplitter();
    }
};

class PictureSplitterFactory : public SplitterFactory{
public:
    virtual ISplitter* CreateSplitter(){
        return new PictureSplitter();
    }
};

class VideoSplitterFactory : public SplitterFactory{
public:
    virtual ISplitter* CreateSplitter(){
        return new VideoSplitter();
    }
};