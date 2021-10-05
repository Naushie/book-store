terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "~> 3.0"
    }
  }
}

provider "aws" {
  profile = "default"
  region = "af-south-1"
}

resource "aws_instance" "book_store_sever" {
  ami = "ami-03590d67411bbd24e"
  instance_type = "t3.micro"
  key_name = "naushad-laptop"

  security_groups = [
    "default"
  ]

  tags = {
    Name = "BookStoreServer"
  }
}
