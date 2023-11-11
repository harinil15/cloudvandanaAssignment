let text = 'This is a sunny day';

function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';
  
    for (let i = 0; i < sentence.length; i++) {
      if (sentence[i] == ' ') {
        
        reversedSentence += word + ' ';
        word = '';
        } else {
          
        word = sentence[i] + word;
     }
    }
  
      reversedSentence += word;
  
    return reversedSentence;
  }
  
  console.log(reverseWords(text));



