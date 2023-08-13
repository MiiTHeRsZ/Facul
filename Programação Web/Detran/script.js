
function validar(event) {
    event.preventDefault()
    let idade = Number(document.querySelector("#idade").value)
    
    var error = document.querySelector("#idade-error")
    error.innerHTML = ""
    if (idade < 18) {
        error.innerHTML = "Você não tem idade para tirar habilitação!"
    } else if (idade != Number) {
        error.innerHTML = "Digite um valor válido!"
    } else {
        error.innerHTML = ""
    }
}

document.querySelector("#cadastrar").addEventListener("click", validar)
document.querySelector("#idade").addEventListener("blur", validar)