

let form = document.getElementById("loginForm");
let userName = document.getElementById("userName");
let password = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let admin;
const logoutBtn = document.getElementById("logoutBtn");
let link;

console.log(admin);

loginBtn.addEventListener("click", () => {
    console.log("Klick på knapp!")
    console.log(userName.value + password.value);
    if (userName.value == "admin" && password.value == "admin") {
        admin = true;
        alert("Inloggad som admin");
       // userName.value = "";
       // password.value = "";
        
    }
    if (admin) {
        console.log("Admin är true");
        let link = document.createElement("a");
        link.innerText = "Admin"
        link.href="/admin"
        link.id="admin"
    
        document.body.appendChild(link)
    }
});

logoutBtn.addEventListener("click", () => {
    console.log("Klick på logga ut!");
    // admin = false;
    location.replace(location.href);
    
});
