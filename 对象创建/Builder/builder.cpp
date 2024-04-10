
class House{ //...
};

class HouseBuilder {
public:
    House* GetResult(){
        return pHouse;
    }
    virtual ~HouseBuilder(){}

    House* pHouse;
    virtual void BuildPart1() = 0;
    virtual void BuildPart2() = 0;
    virtual bool BuildPart3() = 0;
    virtual void BuildPart4() = 0;
    virtual void BuildPart5() = 0;
};

class StoneHouse : public House{ //...
};

class StoneHouseBuilder : public HouseBuilder{

    virtual void BuildPart1() {};
    virtual void BuildPart2() {};
    virtual bool BuildPart3() {};
    virtual void BuildPart4() {};
    virtual void BuildPart5() {};
};

class HouseDirector{
public:
    HouseBuilder* pHoussBuilder;

    HouseDirector(HouseBuilder* pHoussBuilder){
        this->pHoussBuilder = pHoussBuilder;
    }

    House* Construct(){
        pHoussBuilder->BuildPart1();

        for (int i = 0; i < 4; i++){
            pHoussBuilder->BuildPart2();
        }

        bool flag = pHoussBuilder->BuildPart3();

        if(flag){
            pHoussBuilder->BuildPart4();
        }

        pHoussBuilder->BuildPart5();

        return pHoussBuilder->GetResult();
    }
};

int main(){
    HouseBuilder* builder = new StoneHouseBuilder();  // 创建具体的建造者
    HouseDirector director(builder);  // 创建指导者，将具体的建造者传入

    House* house = director.Construct();  // 构建房子

    delete builder;  // 释放内存
    delete house;

    return 0;
}