#include <string>
#include "SplitterFactory.cpp"
using namespace std;

//具体类
class BinarySplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
    virtual ISplitter* clone(){
        return new BinarySplitter(*this);
    }
};

class TxtSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
    virtual ISplitter* clone(){
        return new TxtSplitter(*this);
    }
};

class PictureSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
    virtual ISplitter* clone(){
        return new PictureSplitter(*this);
    }
};

class VideoSplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
    virtual ISplitter* clone(){
        return new VideoSplitter(*this);
    }
};