public void insertAtStart(int data) {
  Node newNode = new Node(data);
  if(head==null){
    head=newNode;
    return;
  }
  newNode.next = head;
  head.prev = newNode;
  head = newNode;

  
}
