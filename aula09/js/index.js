function hello() {
    alert('Hello World!');
}

//let texto = usuario.value; //capturar dados da tela
//console.log(texto);
//document.getElementById("output").innerHTML = texto;

//console.log(res) - Uma arrow function é equivallente a uma função "tradicional" do JavaScript

function login() {

    let usuario = document.getElementById("user").value;
    let senha = document.getElementById("password").value;

    // construindo objeto java script para enviar
    let loginMsg = {
        email: usuario,
        cpf: usuario,
        password: senha
    }
    //construindo a mensagen que será enviada ao backend
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }
    //envia para o servidor 'localhost' o objeto 'msg'
    //.then - qdo voltar a resposta
    // +> arrow function que chama a próxima função com o parâmetro 'res'
    // 'res' é o retorno do fetch
    fetch("http://localhost:8080/user/login", msg)
    .then(res => tratarRetorno(res));
}
    
function tratarRetorno(retorno){
    if(retorno.status == 200) {
        document.getElementById("output").innerHTML = "login com sucesso"
        //extrai o objeto de dentro do 'retorno' e passa para a função 'acesso permitido'
        retorno.json().then(res => acessoPermitido(res));
        acessoPermitido()
    }else{
        document.getElementById("output").innerHTML = "usuário/senha inválidos"
    }

    function acessoPermitido(user) {
        //console.log(user);
        localStorage.setItem("userLogged",JSON.stringify(user));
        window.location = "interna.html"
    }

}