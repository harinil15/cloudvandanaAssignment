let arr = [12,50,45,80,33];
let temp;
for(let i=0; i<arr.length; i++){
    for(let j=i; j<arr.length; j++){
        if(arr[i] < arr[j]){
            temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
    }
}
console.log(arr);
