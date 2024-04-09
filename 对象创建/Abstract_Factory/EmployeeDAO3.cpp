//一系列相互依赖的对象创建工作

#include <vector>
#include <string>

class EmployeeDO{};


class IDBConnection{
public:
    virtual std::string ConnectionString(std::string str) = 0;
};
class IDBCommand{
public:
    virtual std::string CommandText(std::string str) = 0;
    virtual SqlDataReader* ExecuteReader() = 0;
    virtual void SetConnection(IDBConnection* conn) = 0;

};
class IDBDataReader{
public:
    virtual bool Read() = 0;

};

class IDBFactory{
public:
    virtual IDBConnection* CreateDBConnection() = 0;
    virtual IDBCommand* CreateDBCommand() = 0;
    virtual IDBDataReader* CreateDBDataReader() = 0;
};




//支持sql server
class SqlConnection : public IDBConnection{
public:
    virtual std::string ConnectionString(std::string str){
        //...
    };
};
class SqlCommand : public IDBCommand{
public:
    virtual std::string CommandText(std::string str){
        //...
    };
    virtual SqlDataReader* ExecuteReader(){
        //...
    }
    virtual void SetConnection(IDBConnection* conn){
        //...
    }
};
class SqlDataReader : public IDBDataReader{
public:
    virtual bool Read(){
        //...
    }
};

class SqlDBFactory : public IDBFactory{
    //...
};


//支持Oracle
class OracleConnection : public IDBConnection{};
class OracleCommand : public IDBCommand{};
class OracleDataReader : public IDBDataReader{};



class EmployeeDAO
{
    IDBFactory* dbFactory;

public:
    std::vector<EmployeeDO> GetEmployee(){
        //IDBConnection* connection = new SqlConnection();
        IDBConnection* connection = dbFactory->CreateDBConnection();
        connection->ConnectionString("...");

        //SqlCommand* command = new SqlCommand();
        IDBCommand* command = dbFactory->CreateDBCommand();
        command->CommandText("...");
        command->SetConnection(connection);  //关联性

        IDBDataReader* reader = command->ExecuteReader();  //关联性

        while (reader->Read())
        {
            /* code */
            break;
        }
        
    }
};

