var dragElement = document.getElementById('dragElement');

dragElement.onmousedown = function(e) {

  var coords = getCoords(dragElement);
  var shiftX = e.pageX - coords.left;
  var shiftY = e.pageY - coords.top;

  dragElement.style.position = 'absolute';
  document.body.appendChild(dragElement);
  moveAt(e);

  dragElement.style.zIndex = 1000; // над другими элементами

  function moveAt(e) {
    dragElement.style.left = e.pageX - shiftX + 'px';
    dragElement.style.top = e.pageY - shiftY + 'px';
  }

  document.onmousemove = function(e) {
    moveAt(e);
  };

  dragElement.onmouseup = function() {
    document.onmousemove = null;
    dragElement.onmouseup = null;
  };

}

dragElement.ondragstart = function() {
  return false;
};

function getCoords(elem) {
    // (1)
    var box = elem.getBoundingClientRect();
    
    var body = document.body;
    var docEl = document.documentElement;
    
    // (2)
    var scrollTop = window.pageYOffset || docEl.scrollTop || body.scrollTop;
    var scrollLeft = window.pageXOffset || docEl.scrollLeft || body.scrollLeft;
    
    // (3)
    var clientTop = docEl.clientTop || body.clientTop || 0;
    var clientLeft = docEl.clientLeft || body.clientLeft || 0;
    
    // (4)
    var top  = box.top +  scrollTop - clientTop;
    var left = box.left + scrollLeft - clientLeft;
    
    // (5)
    return { top: Math.round(top), left: Math.round(left) };
}


function uploadDocument() {
  var input = document.querySelector('input[type="file"]')

  var data = new FormData()
  data.append('file', input.files[0])  

  console.log("send document with size:" + input.files[0].size + "b to server")
  // fetch('/file/upload', {
  //   method: 'POST',
  //   body: data
  // })
}