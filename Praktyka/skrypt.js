//zad5.1
//   const a = 5;
//     const b = 6;
//     const c = 7;
//     let z;
//     z = Math.sqrt(p*(p-a)*(p-b)*(p-c))
//     console.log("Pole trujkąta wynosi: " + z)
    


//zad5.2

//   let a, b;
//     b = prompt("Podaj liczbe: ")
//     if(13-b){
//     a = 13-b;
//     alert("Oto twoja liczba " + a);
//     }
//     else{
//         a = (b-13)*2;
//         alert("Oto twoja liczb: " + b);
//     }


//zad5.3
//     let a, b;

//     a = Number(prompt("Podaj liczbe a: "))
//     b = Number(prompt("Podaj liczbe b: "))
//     function suma(a, b){
//         if (a == b) {
//             return 3 * (a+b);
//        }
//        else {
//         return a + b;
//        } 
//     } 

//    console.log(suma(a, b)); 
//    console.log(suma(a, b)); 

//zad5.4

// let a, b, c;

// a = Number(prompt("Podaj pierwsza liczbe: "))
// b = Number(prompt("Podaj durgą liczbe: "))

// if (a==0 || b==0){
//     alert("Nie dziel przez 0 !");
// }
// else{
//     c=a*b;
//     alert("Wynik mnozenia to: " + c);
//     c=a/b;
//     alert("Wynik z dzielenia to:  " + c);
// }


//zad5.5

// function liczy(a, b) {
//     if (a == 50 || b == 50 || a + b  == 50){
//         return true;
//     } else{
//         return false
//     }
// }
// console.log(liczy(50, 50));
// console.log(liczy(20, 50));
// console.log(liczy(20, 20));
// console.log(liczy(20, 30));

//zad5.6 

// function sprawdza(a, b){
//     if((a > 0 && b < 0) || (a < 0 && b > 0)){
//         return true;
//     }else { 
//         return false;
//     }
// }

//  console.log(sprawdza(2, 2));
//  console.log(sprawdza(-2, 2));
//  console.log(sprawdza(2, -2));
//  console.log(sprawdza(-2, -2));

//zad5.7


//     unction sprawdza(a, b, c){
//     if (a == turn c);
//     } else if(a === c && b !== c){
//         return b;
//     }else if(b === c && a !== c){
//         return a;
//     }else{
//         return "Brak dwóch równych liczb";
//     }
        
    
// }
//  console.log(sprawdza(1,2,2 ));
//  console.log(sprawdza(1,1,2 ));
//  console.log(sprawdza(1,2,3 ));

//zad5.8

// function znajdz(a, b, c){
//     let max = a; 
//     if(b > max) { 
//         max = b;
//     } 
//     if(c = max){
//         max = c;
//     }
//     return max;
// }
//  console.log(znajdz(1,0,1 ));
//  console.log(znajdz(0, -10, -20 ));
//  console.log(znajdz(1000, 510, 440 ));


//zad7.1

// let a = prompt("Podaj pierwsza liczbe: ");
// let b = prompt("Podaj druga liczbe: ");

// if(a > b ){
//     console.log("Wieksza liczba to: " + a);
// }else if (a < b){
//     console.log("Wieksza liczba to: " + b);
// }else{
//     console.log("Obie liczba sa równe: ");
// }


//zad7.2

// for(let i = 0; i <= 15; i++){
//     if (i % 2 ===  0){
//         console.log(i + " Liczba jest prarzysta");
//     }else{
//         console.log(i + " Liczba jest nieparzysta");
//     }
// }


//zad9.1

// function CzyJestTablica(wartosc){
//     return Array.isArray(wartosc);

// }

// console.log(CzyJestTablica([1, 2, 3]));
// console.log(CzyJestTablica("To nie jest tablica"));
// console.log(CzyJestTablica({a: 1, b: 2}));

//zad9.2

// function PobierzPierwszyElemnt(arr, n){
//     return arr.slice(0, n);
// }

// const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// const n = 5;

// const PierwszyElement = PobierzPierwszyElemnt(arr, n);

// console.log(PierwszyElement);



