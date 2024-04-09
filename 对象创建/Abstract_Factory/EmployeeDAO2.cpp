#include <vector>
#include <string>

class EmployeeDO{};
//class SqlConnection{public: std::string ConnectionString;};
//class SqlCommand{public: std::string CommandText;SqlDataReader* ExecuteReader(){}};
//class SqlDataReader{public: bool Read(){}};


class IDBConnection{
public:
    virtual std::string ConnectionString(std::string str) = 0;
};
class IDBConnectionFactory{
public:
    virtual IDBConnection* CreateDBConnection() = 0;
};

class IDBCommand{
public:
    virtual std::string CommandText(std::string str) = 0;
    virtual SqlDataReader* ExecuteReader() = 0;
    virtual void SetConnection(IDBConnection* conn) = 0;

};
class IDBCommandFactory{
public:
    virtual IDBCommand* CreateDBCommand() = 0;
};

class IDBDataReader{
public:
    virtual bool Read() = 0;

};
class IDBDataReaderFactory{
public:
    virtual IDBDataReader* CreateDBDataReader() = 0;
};


//支持sql server
class SqlConnection : public IDBConnection{
public:
    virtual std::string ConnectionString(std::string str){
        //...
    };
};
class SqlConnectionFactory : public IDBConnectionFactory{

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
class SqlCommandnFactory : public IDBCommandFactory{

};

class SqlDataReader : public IDBDataReader{
public:
    virtual bool Read(){
        //...
    }
};
class SqlDataReaderFactory : public IDBDataReaderFactory{

};


//支持Oracle
class OracleConnection : public IDBConnection{

};
class OracleCommand : public IDBCommand{

};
class OracleDataReader : public IDBDataReader{

};



class EmployeeDAO
{
    IDBConnectionFactory* dbConnectionFactory;
    IDBCommandFactory* dbCommandFactory;
    IDBDataReaderFactory* dbDataReaderFactory;

public:
    std::vector<EmployeeDO> GetEmployee(){
        //IDBConnection* connection = new SqlConnection();
        IDBConnection* connection = dbConnectionFactory->CreateDBConnection();
        connection->ConnectionString("...");

        //SqlCommand* command = new SqlCommand();
        IDBCommand* command = dbCommandFactory->CreateDBCommand();
        command->CommandText("...");
        command->SetConnection(connection);

        IDBDataReader* reader = command->ExecuteReader();

        while (reader->Read())
        {
            /* code */
        }
        

    }
};

