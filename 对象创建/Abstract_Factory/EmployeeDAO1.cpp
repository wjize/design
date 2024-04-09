#include <vector>
#include <string>

class EmployeeDO{};
class SqlConnection{public: std::string ConnectionString;};
class SqlCommand{public: std::string CommandText;SqlDataReader* ExecuteReader(){}void SetConnection(SqlConnection* sqc){}};
class SqlDataReader{public: bool Read(){}};

class EmployeeDAO
{
public:
    std::vector<EmployeeDO> GetEmployee(){
        SqlConnection* connection = new SqlConnection();
        connection->ConnectionString = "...";

        SqlCommand* command = new SqlCommand();
        command->CommandText = "...";
        command->SetConnection(connection);

        SqlDataReader* reader = command->ExecuteReader();

        while (reader->Read())
        {
            /* code */
        }
        

    }
};

