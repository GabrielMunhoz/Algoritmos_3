
class Node(object): 
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

    def getData(self):
        return self.data
    def getNext(self):
        return self.next
    def getPrev(self):
        return self.prev
    def setNext(self,data):
        self.next = data
    def setPrev(self,data):
        self.prev = data
    
            #void append(T valor); // adiciona um elemento no final da lista.
    #void addFirst(T valor); // adiciona um elemento no inicio da lista.
    #void removeLast(); // remove o último elemento da lista.
    #void removeFirst(); // remove o primeiro elemento da lista.
    #int size(); // retorna o número de elementos na lista.
    #T get(int index); retorna o elemento com o indice indicado.


class Pilha(object):
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def append(self,data):
        #adciona um elemento no final da lista
        nova = Node(data)
        if self.isEmpty() == True:
            self.head = nova
            self.tail = nova
            self.size += 1
        else:
            nova.setPrev(self.tail)
            self.tail.setNext(nova)
            self.tail = nova
            self.size += 1

    def addFirst(self,data):
        #adiciona um elemento no inicio da lista
        nova = Node(data)
        if self.isEmpty():
            self.append(data)

        else:
            nova.setNext(self.head)
            self.head.setPrev(nova)
            self.head = nova
            self.size +=1
            
    def removeLast(self):
        #Remove elemento do final da lista
        if self.isEmpty():
            print("Lista Vazia")
        else:
            self.tail = self.tail.getPrev()
            self.tail.setNext(None)
            self.size -=1

    def removeFirst(self):
        #remove elemento do inicio
        if self.isEmpty():
            print("Lista Vazia")
        else:
            self.head = self.head.getNext()
            self.head.setPrev(None)
            self.size -= 1
    def getSize(self):
        #retorna o tamanho da lista
        return self.size
    def getData(self):
        #retorna o dado
        return self.tail.getData()

        pass
    def isEmpty(self):
        #Verifica se lista esta vazia
        if self.size == 0:
            return True
        else:
            return False

p = Pilha()

for i in range(1, 100000):
    p.append(i)

print(p.getData())