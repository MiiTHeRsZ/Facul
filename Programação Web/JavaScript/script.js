const precoEtanol = Number(prompt("Digite o preço do Etanol"))
const precoGasolina = Number(prompt("Digite o preço do Gasolina"))

function verificarCombustivel(precoEtanol, precoGasolina){
    precoGasolina *= .7
    
    return (precoEtanol < precoGasolina)? "O mais vantajoso é o Gasolina" : "O mais vantajoso é o Etanol"
}

alert(verificarCombustivel(precoEtanol, precoGasolina))