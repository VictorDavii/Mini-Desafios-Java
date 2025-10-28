package Service;

import Model.User;

import java.util.HashMap;

public class SistemaLogin {

    private HashMap<String,User> users = new HashMap<>();
    private int ID = 0;

    public void cadastrar(String name, String password){
        if(users.containsKey(name)){
            System.out.println("Usuario já cadastrado");
        } else{
            User user = new User(name, password, ID++);

            users.put(user.getName(),user);
            System.out.println("Usuario cadastrado com sucesso");
        }
    }

    public boolean login(String name, String password){

        User user = users.get(name);

        if(user != null && user.getPassword().equals(password)){
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos!");
            return false;
        }


    }
}
