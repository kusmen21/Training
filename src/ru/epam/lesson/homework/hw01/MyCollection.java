package ru.epam.lesson.homework.hw01;

public class MyCollection<E>
{	
	private Entry<E> firstElement;
	private Entry<E> lastElement;
	private int size = 0;		
			
	public void addFirst(E element)
	{
		Entry<E> entry = new Entry<>(element);
		entry.setNumber(1);
		
		if(firstElement == null)
		{			
			firstElement = entry;
			lastElement = entry;			
		}
		else 
		{
			firstElement.setNumber(2);
			incrementNumbers(firstElement);
			entry.setNext(firstElement);
			firstElement = entry;
		}
		size++;
	}
	
	public void addLast(E element)
	{
		Entry<E> entry = new Entry<>(element);
		
		if(lastElement == null)
		{
			entry.setNumber(1);
			firstElement = entry;
			lastElement = entry;			
		}
		else 
		{
			entry.setNumber(lastElement.getNumber() + 1);
			lastElement.setNext(entry);
			lastElement = entry;
		}
		size++;
	}
	
	public void addMiddle(E element)
	{
		Entry<E> entry = new Entry<>(element);
		
		if(firstElement == null)
		{
			entry.setNumber(1);
			firstElement = entry;
			lastElement = entry;			
		}
		else
		{
			int middle = size / 2 + 1;
			
			Entry<E> toMiddle = firstElement;
			Entry<E> beforeMiddle = null;
			while (toMiddle.getNumber() != middle)
			{
				beforeMiddle = toMiddle;
				toMiddle = toMiddle.getNext();
			}			
			entry.setNext(toMiddle);
			entry.setNumber(toMiddle.getNumber());
			if (size > 1) beforeMiddle.setNext(entry);
			else firstElement = entry;
			incrementNumbers(entry);
		}		
		size++;
	}
	
	public boolean contains(E element)
	{
		if (firstElement == null) return false;
		
		Entry<E> target = firstElement;
		while (target != null)
		{			
			if (target.getData().equals(element)) return true;
			target = target.getNext();
		}		
		return false;
	}
	
	public boolean remove(E element)
	{
		if (firstElement == null) return false;
		
		Entry<E> target = firstElement;
		Entry<E> beforeTarget = null;
		while (target != null)
		{			
			if (target.getData().equals(element))
			{
				if (beforeTarget != null)
				{
					beforeTarget.setNext(target.getNext());
					if (lastElement == null) lastElement = beforeTarget;
				}
				else
				{
					if (target.getNext() == null)
					{
						firstElement = null;
						lastElement = null;
					}
					else
					{
						firstElement = target.getNext();
					}
				}
				decrementNumbers(target);
				return true;
			}
			beforeTarget = target;
			target = target.getNext();
		}		
		return false;
	}
	
	public void print()
	{
		Entry<E> toPrint = firstElement;
		while (toPrint != null)
		{			
			System.out.println(toPrint);
			toPrint = toPrint.getNext();
		}
	}
	
	public int getSize() 
	{
		return size;
	}
	
	// инкрементирование позиций элементов после вставленного
	private void incrementNumbers(Entry<E> from)
	{
		Entry<E> toIncrement = from.getNext();
		while (toIncrement != null)
		{
			toIncrement.setNumber(toIncrement.getNumber() + 1);
			toIncrement = toIncrement.getNext();
		}
	}
	
	// декрементирование позиций элементов после удаленного
	private void decrementNumbers(Entry<E> from)
	{
		Entry<E> toDecrement = from;
		while (toDecrement != null)
		{
			toDecrement.setNumber(toDecrement.getNumber() - 1);
			toDecrement = toDecrement.getNext();
		}
	}

	private static class Entry<E>
	{
		private E data;
		private Entry<E> next;
		private int number;
		
		public Entry(E data) 
		{			
			this.data = data;			
		}	
		
		public void setNext(Entry<E> next) 
		{
			this.next = next;
		}
		
		public void setNumber(int number) 
		{
			this.number = number;
		}

		public E getData() {
			return data;
		}		

		public Entry<E> getNext() {
			return next;
		}

		public int getNumber() {
			return number;
		}

		@Override
		public String toString() {
			return "Entry [number=" + number + ", data=" + data + "]";
		}
	}
}
