# Write a python program to print the contents of a directory using the OS module, Search online for the function which does that
# Using AI
import os

def print_directory_contents(path='/chapter 1 PS'):
    
    # Print the names of all entries in the directory given by `path`.
    # Defaults to current working directory if no path is provided.
    
    try:
        entries = os.listdir(path)
    except FileNotFoundError:
        print(f"Error: The directory {path!r} does not exist.")
        return
    except PermissionError:
        print(f"Error: Permission denied when accessing {path!r}.")
        return

    print(f"Contents of directory {path!r}:")
    for entry in entries:
        print(entry)

if __name__ == '__main__':
    # Example: use current directory or specify a path
    dir_path = input("Enter directory path (leave blank for current directory): ").strip()
    if not dir_path:
        dir_path = '/chapter 1 PS'
    print_directory_contents(dir_path)
