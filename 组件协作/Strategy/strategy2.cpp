class Context{};
class StrategyFactory{public: TaxStrategy* NewStrategy(){  /*...*/  }};

class TaxStrategy{
public:
    virtual double Calculate(const Context& context) = 0;
    virtual ~TaxStrategy(){}
};

class CNTax : public TaxStrategy{
public:
    virtual double Calculate(const Context& context){
        //CN******
    }
};

class USTax : public TaxStrategy{
public:
    virtual double Calculate(const Context& context){
        //CN******
    }
};

class DETax : public TaxStrategy{
public:
    virtual double Calculate(const Context& context){
        //CN******
    }
};

class FRTax : public TaxStrategy{       //新增
public:
    virtual double Calculate(const Context& context){
        //CN******
    }
};

class SalesOrder{
private:
    TaxStrategy* strategy;

public:
    SalesOrder(StrategyFactory* strategyFactory){
        this->strategy = strategyFactory->NewStrategy();
    }
    ~SalesOrder(){
        delete this->strategy;
    }

    double CalculateTax(){
        //...
        Context context;

        double val = strategy->Calculate(context);
        //...
    }
};