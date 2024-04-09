#include <string>
using namespace std;

class ISplitter{
public:
    virtual void split() = 0;
    virtual ~ISplitter(){}
};

class BinarySplitter : public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class TxtSplitter: public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class PictureSplitter: public ISplitter{
public:
    virtual void split(){
        //...
    }
};

class VideoSplitter: public ISplitter{
public:
    virtual void split(){
        //...
    }
};