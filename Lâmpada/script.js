/*Constante*/
const turnOn = document.getElementById('turnOn');
const turnOff = document.getElementById('turnOff');
const lamp = document.getElementById('lamp');

/*Funções da Lâmpada*/
function isLampBroken(){
return lamp.src.indexOf('quebrada') > -1 

}
function lampOn(){ /*se não estiver quebrada, realiza a troca para img acessa */
if(!isLampBroken()){
lamp.src = './img/ligada.jpg';
}
};

function lampOff(){
if(!isLampBroken()){
lamp.src = './img/desligada.jpg';
}
};
function lampbroken(){
lamp.src = './img/quebrada.jpg';
}
/*Eventos da lâmpada*/
turnOn.addEventListener('click',lampOn);
turnOff.addEventListener('click',lampOff);
lamp.addEventListener('mouseover',lampOn);
lamp.addEventListener('mouseleave',lampOff);
lamp.addEventListener('dblclick',lampbroken);