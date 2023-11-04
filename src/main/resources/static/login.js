

let form = document.getElementById("loginForm");
let userName = document.getElementById("userName");
let password = document.getElementById("password");
const loginBtn = document.getElementById("loginBtn");
let admin;
const logoutBtn = document.getElementById("logoutBtn");
let link;
let memberAdmin;

userName.value = "";
    password.value = "";

    


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
         
         
        let memberAdmin = document.createElement('a');
        memberAdmin.innerText = "Medlemslista för admin"
        memberAdmin.href="/memberAdmin"
        
        

        let br =document.createElement("br");
        
        
        

        document.body.appendChild(link)
        document.body.appendChild(br)
        document.body.appendChild(memberAdmin)
        
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
        
        
    }
    printLink();
});

logoutBtn.addEventListener("click", () => {
    console.log("Klick på logga ut!");
    
    alert("Du är utloggad");
    
    
    localStorage.clear();
    location.replace(location.href);

    
});

