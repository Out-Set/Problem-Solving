function TreeConstructor(strArr) { 
    var arr = [ ], counts= {};
    for (i=0;i < strArr.length;i++){
      arr.push(strArr[i].match(/[0-9]/g)[0]);
      arr.push(strArr[i].match(/[0-9]/g)[1]);
    }
    arr.forEach(function(x){counts[x] = (counts[x] || 0 ) + 1});
    for(j in counts){
      if (counts[j] >=4){
        return false;
      }
    }
    return true;
}