let list = document.querySelector("ul")

//Getting list of students when opening the webpage

getStudents()
//Form button action.
document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    //Creating blog object from the form information
    let MyDataClass= {
        student: document.getElementById("st").value,
        course: document.getElementById("co").value
    }

    //Posting the object as JSON to server
    //After posting getting the updated list of students from the server
    fetch("http://localhost:8080/addstudent",
        {
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify(MyDataClass)
        })
        .then(resp => getStudents())
})


//Function for getting all the students
function getStudents()
{
    //Empty the list in webpage
    list.innerHTML = ""

    //Fetch all the students from the server
    fetch("http://localhost:8080/students")
    .then(response => response.json())
    .then( data =>
    {
        //Create list item of each student object
        data.forEach(i => {
            let li = document.createElement("li")
            li.innerText = i.course
            list.appendChild(li)
        })
    })
}