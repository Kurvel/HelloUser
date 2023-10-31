

let form = document.getElementById("loginForm");
let userName = document.getElementById("userName");
let password = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let admin;
const logoutBtn = document.getElementById("logoutBtn");
let link;


// console.log(localStorage.getItem("userName"));
// console.log(localStorage.getItem("password"));
 un = localStorage.getItem("userName");
 pw = localStorage.getItem("password");
 console.log(un + pw);

 

 if (un == "admin" && pw == "admin") {
    admin = true;
 }

 function printLink() {
    if (admin) {
        console.log("Admin är true");
        let link = document.createElement("a");
        link.innerText = "Formulär"
        link.href="/form"
         
        
        // link.id="admin"
        
        document.body.appendChild(link)
    }
 }
 printLink();

console.log(admin);

loginBtn.addEventListener("click", () => {
    console.log("Klick på knapp!");
    console.log(userName.value + password.value);
    if (userName.value == "admin" && password.value == "admin") {
        admin = true;
        localStorage.setItem("userName", userName.value);
        localStorage.setItem("password", password.value);
        alert("Inloggad som admin");
        userName.value = "";
        password.value = "";
        
    }
    printLink();
});

logoutBtn.addEventListener("click", () => {
    console.log("Klick på logga ut!");
    
    localStorage.clear();
    location.replace(location.href);

    
});
